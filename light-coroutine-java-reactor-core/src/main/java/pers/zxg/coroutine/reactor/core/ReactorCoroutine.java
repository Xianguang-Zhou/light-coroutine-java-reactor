/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.reactor.core;

import java.util.concurrent.ExecutionException;

import pers.zxg.coroutine.Coroutine;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class ReactorCoroutine {

	public static <T> T await(Mono<T> mono) throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public static <T> Mono<T> create(Coroutine.Callable<T> callable) {
		throw new NotWeaved();
	}
}
