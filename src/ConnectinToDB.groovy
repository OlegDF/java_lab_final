@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='9.4-1205-jdbc42')
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:postgresql://localhost/labdb", "postgres", "mordheim", "org.postgresql.Driver")
def results = sql.rows("select * from employees;")
println results.size()
sql.close()