/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.multilibrary.foysaldev.io.reactivex.rxjava3.android;

import android.os.Looper;
import com.multilibrary.foysaldev.io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MainThreadDisposable implements Disposable {

    public static void verifyMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(
                "Expected to be called on the main thread but was " + Thread.currentThread().getName());
        }
    }

    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    @Override
    public final boolean isDisposed() {
        return unsubscribed.get();
    }

    @Override
    public final void dispose() {
        if (unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                AndroidSchedulers.mainThread().scheduleDirect(this::onDispose);
            }
        }
    }

    protected abstract void onDispose();
}
