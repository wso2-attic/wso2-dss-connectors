* Custom Query Based Data Source Class: 'org.wso2.dss.connectors.mongodb.MongoDBDataSource'

* Data Source Properties :-

  - 'servers': A comma separate list of server hosts and ports.
     e.g.:-
      - "localhost"
      - "125.10.5.3, 125.10.5.4"
      - "192.168.3.1:27017, 192.168.3.2:27017"
  - 'database': The name of the database to connect.
  - 'write_concern': The write concern value as mentioned in "com.mongodb.WriteConcern".
  - 'read_preference": The read preference value as mentioned in "com.mongodb.ReadPreference".