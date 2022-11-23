package io.ubilab.result.model
import java.util.Date
import scala.util.Random


case class EventResult(
    id:        String, // created | received | seen
    idOwner:   Int,
    createdAt: Date
)

case class Result(id:              Random,
                  idOwner:         Random,
                  idRecipients:    List[Int],
                  isSeen:          Boolean,
                  eventResults:    List[EventResult],
                  contentOfResult: String)
