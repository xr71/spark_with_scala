import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

println(spark)
