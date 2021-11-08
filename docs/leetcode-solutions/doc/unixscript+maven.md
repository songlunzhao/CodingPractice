#!/usr/bin/expect -f

set passfile [open "/User/stzhao/scripts/unixpassword"]
gets $passfile password
close $passfile

spawn ssh stzhao@sl73commonpq263
expect "password"
send "$password\r"
interact

***************login to 2 machines***************
spawn ssh stzhao@sl73commapq263
expect "password"
send "$password\r"
expect "$"
send "ssh stzhao@sl73toolapd089\r"
expect "password"
send "$password\r"
interact


****************scp copy file from remote****************
scp stzhao@sl73commapq263:/usr/mware/tcServerAppDetails/file.txt .


****************curl****************
test Google Firebase 
curl -s "https://fcm.googleapis.com/fcm/send" -H "Authorization: key=SERVER_KEY"
-H "Content-Type:application/json" -d '{
"to":"DEVICE_TOKEN",
"data":{"fieldname1":"fieldvalue1", "fieldname2":"fieldvalue2"}
}'

****************replace token change oracle syntax to H2 syntax****************
*****#!/bin/sh
cp target/migrate.sql target/schema.sql
sed -i.bak "s/__db.schema.user__ .//g" target/schema.sql
sed -i.bak -n "/Changeset/!p" target/schema.sql
sed -i.bak "s/MODIFY(PHONE_ENCRYPTD_NUM VARCHAR2(160)/ALTER COLUMN PHONE_ENCRYPTD_NUM VARCHAR2(160)/g" target/schema.sql

****************maven****************

***build-in os profile Windows/unix***
https://maven.apache.org/guides/introduction/introduction-to-profiles.html
<profiles>
  <profile>
    <id>Windows</id>
    <activation>
      <os>
        <family>Windows</family>
      </os>
    </activation>
    <properties>
        <script.extension>.bat</script.extension>
    </properties>
  </profile>
  <profile>
      <id>unix</id>
      <activation>
        <os>
          <family>unix</family>
        </os>
      </activation>
      <properties>
          <script.extension>.sh</script.extension>
      </properties>
    </profile>
</profiles>

***liquibase plugin***
<plugin>
    <groupId>org.liquibase</groupId>
    <artifactId>liquibase-maven-plugin</artifactId>
    <version>3.3.1</version>
    <configuration>
        <driver>org.h2.Driver</driver>
        <emptyPassword>true</emptyPassowrd>
        <username>sa</username>
        <url>jdbc:h2:${project.basedir}/target/h2/profile;MODE=Oracle;DB_CLOSE_ON_EXIT=FALSE</url>
        <verbose>true</verbose>
        <dropFirst>true></dropFirst>
        <migrationSqlOutputFile>${project.build.directory}/migrate.sql</migrationSqlOutputFile>
        <outputFileEncoding>UTF-8</outputFileEncoding>
        <promptOnNonLocalDatabase>false</promptOnNonLocalDatabase>
        <clearCheckSums>true</clearCheckSums>
        <expressionVariables>
            <__db.tablespace.name__>PROFILE</__db.tablespace.name__>
        </expressionVariables>
    </configuration>
    <executions>
        <execution>
            <id>validation</id>
            <phase>process-resources</phase>
            <goals>
                <goal>updateSQL</goal>
            </goals>
            <configuration>
                <changeLogFile>src/test/test-changelog.xml</changeLogFile>
            </configuration>
        </execution>
    </executions>
    <dependencies>
        <dependency>
            <groupdId>com.h2database</groupdId>
            <artifactId>h2</artifactId>
            <version>1.4.200</version>
        </dependency>
        <dependency>
            <groupdId>org.liquibase</groupdId>
            <artifactId>liquibase-core</artifactId>
            <version>3.3.1</version>
        </dependency>
        <dependency>
            <groupdId>com.oracle</groupdId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0.2.0</version>
        </dependency>
    </dependencies>
</plugin>

***plugin to execute a shell script***
<plugin>
    <groupId>org.codehaus.mojo<groupdId>
    <artifactId>exec-maven-plugin</artifactId>
    <version>1.2</version>
    <executions>
        <execution>
            <goals>
                <goal>exec</goal>
            </goals>
            <configuration>
                <executable>${basedir}/replace-token${script.extension}</executable>
            </configuration>
        </execution>
    </executions>
</plugin>