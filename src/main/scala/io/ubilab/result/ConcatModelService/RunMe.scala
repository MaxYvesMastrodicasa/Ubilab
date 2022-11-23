package io.ubilab.result.ConcatModelService
import io.ubilab.result.model._
import io.ubilab.result.service._
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import java.util.Date
import scala.util.Random

class Temp(
            var id: Random = new Random(99),
            var idOwner: Random = new Random(99),
            var idRecipients: List[Int] = List[Random],
            var isSeen: Boolean = false,
            var eventResults: List[EventResult] = List(EventResult.apply("Max",idOwner = _, createdAt = Date)),
            var contentOfResult: String = ""
          )
object RunMe {

var temp = new Temp()
var idResult = 0
  def ResultMaker (result: Result): Unit ={
    Result.apply(
      temp.id,
      temp.idOwner,
      temp.idRecipients,
      temp.isSeen,
      temp.eventResults,
      temp.contentOfResult
    )
  }

  def step1(resultService: ResultService) = {
    //Appel de la Class ResultService
    val resultService = ResultService.build

    //Avec un Result
    val result1 = ResultMaker(Result(_))

    //initialisation des fonctions
    // appel fonction getAllResult List()
    resultService.getAllResult()
    // appel fonction unseenResult -> 1
    idResult +=1
    resultService.unseenResult(idResult+1)

    // appel fonction get AllUnseenResult List()
    resultService.getAllResultUnSeen()
  }
  //Ajout d'un Result
  def step2(resultService: ResultService)={
    val result2 = ResultMaker(Result(_))

    resultService.getAllResult()
    idResult +=1
    resultService.unseenResult(idResult)
    resultService.getAllResultUnSeen()
  }

  def step3(resultService: ResultService) = {
    case result3 => ResultMaker(Result(_))
      resultService.getAllResult()
      idResult +=1
      resultService.unseenResult(idResult)
      resultService.getAllResultUnSeen()
    case result4 => ResultMaker(Result(_))
      resultService.getAllResult()
      idResult +=1
      resultService.unseenResult(idResult)
      resultService.getAllResultUnSeen()
    case result5 => ResultMaker(Result(_))
      resultService.getAllResult()
      idResult +=1
      resultService.unseenResult(idResult)
      resultService.getAllResultUnSeen()

  }

  def step4(resultService: ResultService) = {
    case result3 => ResultMaker(Result(_))
      resultService.seenResult(temp.id)
      resultService.getAllResultSeen().length shouldEqual 1
      resultService.getAllResult().head.isSeen shouldEqual true
    case result4 => ResultMaker(Result(_))
      resultService.seenResult(temp.id)
      resultService.getAllResultSeen().length shouldEqual 1
      resultService.getAllResult().head.isSeen shouldEqual true
    case result5 => ResultMaker(Result(_))
      resultService.seenResult(temp.id)
      resultService.getAllResultSeen().length shouldEqual 1
      resultService.getAllResult().head.isSeen shouldEqual true

  }
}
