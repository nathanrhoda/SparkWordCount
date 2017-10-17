package main

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object WordCounter  {
  def main(args: Array[String]) {
      if (args.length != 2){
        println("Not enough parameters supplied")       
      } else {
        
        var source = args(0)
        var target = args(1)
        val conf = new SparkConf().setAppName("Word Counter").setMaster("local[2]").set("spark.executor.memory","1g")        
        val sc = new SparkContext(conf)
        val textFile = sc.textFile(source)
        val tokenizedFileData = textFile.flatMap(line=>line.split(" "))
        val countPrep = tokenizedFileData.map(word=>(word, 1))
        val counts = countPrep.reduceByKey((accumValue, newValue)=>accumValue + newValue)
        val sortedCounts = counts.sortBy(kvPair=>kvPair._2, false)
        sortedCounts.saveAsTextFile(target)        
     }
  }
}