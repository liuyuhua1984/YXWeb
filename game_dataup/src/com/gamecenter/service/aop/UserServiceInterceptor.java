package com.gamecenter.service.aop;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.gamecenter.model.LoginLog;

//@Aspect
@Service
public class UserServiceInterceptor {
	
	public static final Logger log = Logger.getLogger(UserServiceInterceptor.class);
	
	// 将缓存客户端工具类 MemcachedCache 织入进来
//	@Resource
//	private MemCachedClient containsKey;
	
	/*@Pointcut(value="切入点表达式", argNames = "参数名列表") 定义pointcunt
	 * 
	 * 必须满足 1：路径条件匹配 2：参数匹配 */
	@Pointcut(value = "execution(* com.gamecenter.service.DataService.*(..))&&args(timeslice)", argNames = "timeslice")
	private void aPointcut(String timeslice) {
	}
	
	/**
	 * 之前调用
	 */
	@Before(value = "aPointcut(timeslice)")
	public void beforeAdvice(JoinPoint joinPoint, String timeslice) {
		System.out.println("===========before advice param:" + joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut = "aPointcut(timeslice)", returning = "list")
	public void afterReturn(String timeslice, Object list) {
		System.out.println("===========afterReturn:" + list);
		// System.out.println("===========before advice param:"+joinPoint.getSignature().getName() );
	}
	
	@After(value = "aPointcut(timeslice)")
	public void after(JoinPoint joinPoint, String timeslice) {
		System.out.println("===========after");
	}
	
	/* *
	 * 环绕装备 用于拦截查询 如果缓存中有数据，直接从缓存中读取；否则从数据库读取并将结果放入缓存
	 * 
	 * @param call
	 * 
	 * @param timeslice
	 * 
	 * @return */
	@Around("aPointcut(timeslice)")
	public Object doFindUserByNameAround(ProceedingJoinPoint call, String timeslice) {
		log.info("name:" + timeslice);
		List<LoginLog> list = null;
		try {
			list = (List<LoginLog>) call.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
}
