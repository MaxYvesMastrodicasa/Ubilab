package io.ubilab.result.service
import io.ubilab.result.model._
import scala.util.Random

class ResultService {

  def addResult(result:Result) = {}

  def seenResult(idResult:Int) = {}

  def unseenResult(idResult:Int) = {}

  def getAllResult():List[Result] = List(Result)

  def getAllResultSeen():List[Result] = List()

  def getAllResultUnSeen():List[Result] = List()

  def numberOfEventSeen:Int = ???
}

object ResultService {
  def build:ResultService = new ResultService
}