
# distributed in-memory cache -- hazelcast

# cache library -- caffeine cache

# get thread dump of Java process
Identify the process. Launch the task manager by, pressing Ctrl + Shift + Esc and find the Process ID of the Java (Confluence) process. ...
Run jstack <pid> to Capture a Single Thread Dump. This command will take one thread dump of the process id <pid>, in this case the pid is 22668:

# Unix commands
    ps -ef, ipconfig, netstate
    

# popular technologies
  Facebook Cassandra -- non sql db
  Apache Kafka -- messaging queue, software bus using stream-processing
  Apache Hadoop -- distributed big data system, map-reduce
  Apache Cassandra is a NoSQL database ideal for high-speed, online transactional data, 
  while Hadoop is a big data analytics system that focuses on data warehousing and data lake use cases
  


 
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

# In memory database -- Redis, memcached

# Blob store -- Amazon S3 --Amazon Simple Storage Service
 provides object storage through a web service interface
 
# Java multi-threading -- need work

Race condition -- both threads are "racing" to access/change the data.
Dead lock -- both thread wait for another thread for some resources
 Volatile variable --
 If you mark any variable as volatile, 
 then all the threads can read its value directly from the main memory rather than CPU cache, so that each thread can get an updated value of the variable
Thread starvation -- 
is basically a situation or condition where a thread won’t be able to 
have regular access to shared resources and therefore is unable to 
proceed or make progress. 
This is because other threads have high priority and 
occupy the resources for too long.
Live lock --
Similar to deadlock, livelock is also another concurrency problem. 
In this case, the state of threads changes between one another without 
making any progress. Threads are not blocked but their execution is stopped 
due to the unavailability of resources.
 Context switching --
 It allows multiple processes to share the same CPU. In context switching, 
 the state of thread or process is stored so that the execution of 
 the thread can be resumed later if required.
 ThreadLocal -- 
 variables are special kinds of variables created and provided by the 
 Java ThreadLocal class. These variables are only allowed to be 
 read and written by the same thread. 
  

# relational db and non-relational db -- pros & cons

# distributed file system, message q, non-relational db, consistent hashing, 
redis in memory db, hazelcast, what is pre-cache service
https://www.javacodegeeks.com/2019/02/nosql-databases-cassandra-vs-mongo-vs-redis-db-comparison.html
rabbitmq vs kafka vs redis
##distributed file storage
1. HDFS
2. Amanzon S3 - Simple Storage Service
##consistent hashing
1. hash record keys to a integer range, for example (0, power(2,32)-1), that is 0 to the largest integer;
2. place these integers on a ring.
3. hash server name or server ip into same integer range, and save the hash value in a list.
4. when a record comes in, calculate its hash value, 
go through server list, find the first server that its hash value 
greater or equals to the record hash value. 
if record hash value greater than the largest server hash value, 
assign the record to the first server on the server list.

int findServerId(String recordId){
    //index -- serverId, value -- serverHashValue
    int[] serverHashValue = new int[];
    int recordHashValue = hash(recordId);
    for(int i=0; i<serverHashValue.length; i++){
        if(recordHashValue<=serverHashValue[i])
            return i;
    }
    return 0;
}

# master write only db, plus multiple read only slave dbs - read replica, shading strategy on write db


# database design for non-relational data stores 
https://www.mongodb.com/nosql-explained/data-modeling
https://www.mongodb.com/nosql-explained/best-nosql-database

# load balancer strategy -- 
 1. round robin - weighted round robin (each server has different weight), dynamic round robin (real time calculation of server weight)
 2. least connections - choosing the server with least number of active connections
 3. weighted least connections - the number of active connections and relative capacity of the server
 4. source ip hash - 
 5. url hash
 6. least response time - least number of active connections and least average response time is selected
 7. least bandwidth method - server consume least bandwidth is selected
 8. customer load method
## application layer algorithm
 1. least pending requests
  
 
 
