# database design ACID
Atomicity -- support transactional
Consistency -- all nodes have same data
Isolation -- If the multiple transactions are running concurrently, 
they should not be affected by each other
Durability -- Changes that have been committed to the database should remain even in the case of software and system failure

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
    
# money data type, 
oracle Number(13,4)
mysql Decimal(13,4)
sqlserver Money

# hibernate 
 ##life cycle of entity
 
 ###Transient 
 -- exists in heap memory. hibernate does not manage transient entity
 ###Persistent 
 -- hibernate manage the persistence of persistent entity, object committed will be saved to db 
 ###Detached 
 -- detached entity has representation in db. when a hibernate session is closed, the entity becomes detached. 
 We can use load(),refresh(),merge(),update(),save() to open a new session and re-attach the entity. 
 ###Removed
 -- when persistent entity is passed to session's remove method, the hibernate session will remove the entity from session.
    