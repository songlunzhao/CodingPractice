# Spring scope
    * singleton:
    * prototype: (create instance every time is used),
    * request: This scopes a bean definition to an HTTP request.
            Only valid in the context of a web-aware Spring ApplicationContext.
            Such as WebApplicationContext
    * session: This scopes a bean definition to an HTTP session.
            Only valid in the context of a web-aware Spring ApplicationContext.
    * global-session: This scopes a bean definition to a global HTTP session.
            Only valid in the context of a web-aware Spring ApplicationContext.
            
# difference between WebApplicationContext & ApplicationContext
    https://stackoverflow.com/questions/11708967/what-is-the-difference-between-applicationcontext-and-webapplicationcontext-in-s

# different ways to get Spring bean
   context.getBean, @Autowired,
# different ways to create Spring bean
   @Configuration + @Bean(name="");
   Spring create bean automatically when find @autowired annotation
   Spring scan xml file
# Difference between factory pattern and strategy pattern
    * A factory pattern is a creational pattern.
    * A strategy pattern is an operational pattern.
    * Put another way, a factory pattern is used to create objects of a specific type.
        A strategy pattern is use to perform an operation (or set of operations) in a particular manner.
        In the classic example, a factory might create different types of Animals: Dog, Cat, Tiger, while a strategy pattern would perform
        particular actions, for example, Move; using Run, Walk, or Lope strategies.
        In fact the two can be used together. For example, you may have a factory that creates your business objects. It may use different strategies based on the persistence medium. If your data is stored locally in XML it would use one strategy. If the data were remote in a different database, it would use another.
        We can have a strategy factory to create different strategy based on input type.
        animalStrategyFactory.createAnimalStrategy(String animalType)
        
# Spring AOP 
    https://docs.spring.io/spring-framework/docs/2.5.x/reference/aop.html
        save time UTC in database, how to return time in different timezone without 
        change original code?
        
        create a Aspect class, declare a pointcut method, use @Pointcut method to weave the method to
        different package in original code. @Pointcut supports wildcard match
        https://stackoverflow.com/questions/49884801/wildcard-support-on-package-name-in-spring-aop-pointcut-expression
        
# Spring boot
# Spring annotation - refresh to change config on the fly -- need more work
        org.springframework.cloud.context.refresh.ContextRefresher
        SmartContextLoader 
        https://www.baeldung.com/java-restart-spring-boot-app
        https://stackoverflow.com/questions/48570314/how-to-switch-spring-profile-at-runtime
        
# Spring concurrency - ThreadPoolTaskExecutor
https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/scheduling.html        