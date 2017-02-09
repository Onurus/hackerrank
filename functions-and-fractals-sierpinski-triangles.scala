//https://www.hackerrank.com/challenges/functions-and-fractals-sierpinski-triangles
object Solution {
  case class Triangle (x:Int, y:Int , size:Int)
      
  def draw(set:Array[Triangle]){
     var matrix = Array.ofDim[Int](32,63)
     set.foreach(t => {
         for( i <- 0 until t.size ){
             for( j <- t.x-i to t.x+i){
                 matrix(t.y+i)(j)=1
             }
         }
     })
     for( i <- 0 until 32 ){
             for( j <- 0 until 63){
                 if(matrix(i)(j)==1){
                     print("1")
                 }else{
                      print("_")
                 }
                 
             }
         println()
       }
  }
  def divide(base:Triangle):Array[Triangle]={
    Array(Triangle(base.x,base.y,base.size/2),Triangle(base.x+base.size/2,base.y+base.size/2,base.size/2),Triangle(base.x-base.size/2,base.y+base.size/2,base.size/2))
  }
      
  def drawTriangles(n: Int) {
     var result:Array[Triangle] = Array(Triangle(31,0,32))
     var i = n
     while(i>0){
        var resultSet:Array[Triangle]=result.map(divide).flatten
        result=resultSet
        i=i-1
    }
      draw(result)
  }

  def main(args: Array[String]) {
    drawTriangles(readInt())
  }
}
