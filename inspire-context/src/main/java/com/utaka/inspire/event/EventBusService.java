/*
 * Copyright (c) 2018. utaka and/or its affiliates.
 */

package com.utaka.inspire.event;

/**
 * 提供事件总线服务
 *
 * @see DefaultEventBusService
 * @see EventBusManager
 */
public interface EventBusService {

    /**
     * Posts an event to all registered handlers. This method will return
     * successfully after the event has been posted to all handlers, and
     * regardless of any exceptions thrown by handlers.
     * <p/>
     * <p/>
     * If no handlers have been subscribed for {@code event}'s class, and {@code event} is not
     * already a {@link com.google.common.eventbus.DeadEvent}, it will be wrapped in a DeadEvent and reposted.
     *
     * @param event event to post.
     */
    void post(Object event);

    /**
     * Registers all handler methods on {@code object} to receive events.
     * Handler methods are selected and classified using this EventBus's
     *
     * @param object object whose handler methods should be registered.
     */
    void register(Object object);

    /**
     * Unregisters all handler methods on a registered {@code object}.
     *
     * @param object object whose handler methods should be unregistered.
     * @throws IllegalArgumentException if the object was not previously registered.
     */
    void unregister(Object object);


    /**
     * Posts an event to all registered handlers. This method will return
     * successfully after the event has been posted to all handlers, and
     * regardless of any exceptions thrown by handlers.
     * <p/>
     * <p/>
     * If no handlers have been subscribed for {@code event}'s class, and {@code event} is not
     * already a {@link com.google.common.eventbus.DeadEvent}, it will be wrapped in a DeadEvent and reposted.
     *
     * @param event event to post.
     */
    void asyncPost(Object event);

    /**
     * Registers all handler methods on {@code object} to receive events.
     * Handler methods are selected and classified using this EventBus's
     *
     * @param object object whose handler methods should be registered.
     */
    void registerAsync(Object object);

    /**
     * Unregisters all handler methods on a registered {@code object}.
     *
     * @param object object whose handler methods should be unregistered.
     * @throws IllegalArgumentException if the object was not previously registered.
     */
    void unregisterAsync(Object object);

}
