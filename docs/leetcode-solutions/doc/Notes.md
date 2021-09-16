
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

# relational db and non-relational db -- pros & cons

# distributed file system, message q, non-relational db, consistent hashing, 
redis in memory db, hazelcast, what is pre-cache service
https://www.javacodegeeks.com/2019/02/nosql-databases-cassandra-vs-mongo-vs-redis-db-comparison.html

rabbitmq vs kafka vs redis


# master write only db, plus multiple read only slave dbs - read replica, shading strategy on write db


# database design for non-relational data stores 
https://www.mongodb.com/nosql-explained/data-modeling
https://www.mongodb.com/nosql-explained/best-nosql-database
