
# distributed in-memory cache -- hazelcast
# cache library -- caffeine cache


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

# Oracle Execution plan
    select * from plan_table_output
    set autotrace traceonly, after execute the sql, oracle can show the execution plan
    of the sql.
    execution plan shows all execution steps of the sql (select, sort,
    nest loop, table access full, table access by index, index scan ...)
    how much time on each steps, and how many rows retrived on each steps etc, etc..

    * how to get oracle execution plan
    https://blogs.oracle.com/optimizer/how-to-generate-a-useful-sql-execution-plan

    method 1 to get an execution plan without execute the sql
    explain plan for
    select  e.ename,r.rname
    from    employees  e
    join    roles       r on (r.id = e.role_id)
    join    departments d on (d.id = e.dept_id)
    where   e.staffno <= 10
    and     d.dname in ('Department Name 1','Department Name 2');

    method 2 get execution plan after execute the sql
    select sql_id, child_number, sql_text
    from   v$sql
    where  sql_text like '%MY_TEST_QUERY%'
    and    sql_text not like '%v$sql%';
    
# Unix commands
    ps -ef, ipconfig, netstate
    
# popular technologies
  Facebook Cassandra -- non sql db
  Apache Kafka -- messaging queue, software bus using stream-processing
  Apache Hadoop -- distributed big data system, map-reduce
  Apache Cassandra is a NoSQL database ideal for high-speed, online transactional data, 
  while Hadoop is a big data analytics system that focuses on data warehousing and data lake use cases
  
  
# hibernate 
 life cycle of entity
 
 ##Transient 
 -- exists in heap memory. hibernate does not manage transient entity
 ##Persistent 
 -- hibernate manage the persistence of persistent entity, object committed will be saved to db 
 ##Detached 
 -- detached entity has representation in db. when a hibernate session is closed, the entity becomes detached. 
 We can use load(),refresh(),merge(),update(),save() to open a new session and re-attach the entity. 
 ##Removed
 -- when persistent entity is passed to session's remove method, the hibernate session will remove the entity from session.
 
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


# Scalability issue
Scaling the database: 
• Vertical scaling vs Horizontal scaling 
• SQL vs NoSQL 
• Master-slave replication 
• Read replicas 
• Consistency models 
• Database sharding 
Other talking points: 
• Keep web tier stateless 
• Cache data as much as you can 
• Support multiple data centers 
• Lose couple components with message queues 
• Monitor key metrics. For instance, QPS during peak hours and latency while users 
refreshing their news feed are interesting to monitor.


# TODO   
# Blob store -- Amazon S3 --Amazon Simple Storage Service
 provides object storage through a web service interface
 
# Java multi-threading -- need work

Race condition -- both threads are "racing" to access/change the data.

# relational db and non-relational db -- pros & cons

# distributed file system, message q, non-relational db, consistant hashing, 
redis in memory db, hazelcast, what is pre-cache service
https://www.javacodegeeks.com/2019/02/nosql-databases-cassandra-vs-mongo-vs-redis-db-comparison.html

rabbitmq vs kafka vs redis


# master write only db, plus multiple read only slave dbs - read replica, shading strategy on write db

# money data type, 
oracle Number(13,4)
mysql Decimal(13,4)
sqlserver Money
 
  