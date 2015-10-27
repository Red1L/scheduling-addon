/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.scheduler.internal;

import org.seedstack.seed.scheduler.api.ScheduledTaskBuilder;
import org.seedstack.seed.scheduler.api.ScheduledTasks;
import org.seedstack.seed.scheduler.api.Task;
import org.quartz.Scheduler;

import javax.inject.Inject;

/**
 * @author pierre.thirouin@ext.mpsa.com
 *         Date: 14/01/14
 */
class ScheduledTasksImpl implements ScheduledTasks {

    @Inject
    private Scheduler scheduler;

    @Override
    public ScheduledTaskBuilder scheduledTask(Class<? extends Task> taskClass) {
        return new ScheduledTaskBuilderImpl(taskClass, scheduler);
    }
}
