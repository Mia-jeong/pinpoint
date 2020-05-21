/*
 * Copyright 2020 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context.monitor.metric;

import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.DoubleGauge;
import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.IntCount;
import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.IntGauge;
import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.LongCount;
import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.LongGauge;

import java.util.Collections;
import java.util.Map;

/**
 * @author Taejin Koo
 */
public class DisabledCustomMetricRegistryService implements CustomMetricRegistryService {

    @Override
    public boolean register(IntCount intCount) {
        return false;
    }

    @Override
    public boolean register(LongCount longCount) {
        return false;
    }

    @Override
    public boolean register(IntGauge intGauge) {
        return false;
    }

    @Override
    public boolean register(LongGauge longGauge) {
        return false;
    }

    @Override
    public boolean register(DoubleGauge doubleGauge) {
        return false;
    }

    @Override
    public boolean unregister(IntCount intCount) {
        return false;
    }

    @Override
    public boolean unregister(LongCount longCount) {
        return false;
    }

    @Override
    public boolean unregister(IntGauge intGauge) {
        return false;
    }

    @Override
    public boolean unregister(LongGauge longGauge) {
        return false;
    }

    @Override
    public boolean unregister(DoubleGauge doubleGauge) {
        return false;
    }

    @Override
    public Map<String, CustomMetricWrapper> getCustomMetricMap() {
        return Collections.emptyMap();
    }
}
