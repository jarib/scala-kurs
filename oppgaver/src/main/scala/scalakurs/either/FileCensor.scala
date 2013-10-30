package scalakurs.either

import java.io.File
import scala.io.Source


object FileCensor {

  val errorMessage = "Wait for Java 8, you filthy hound! It's backward compatible!!!"

  // projection should contain errorMessage if file name contains the wrong words
  // Hint: scala.io.Source.fromFile(file)
  def fetchUncensoredContent(file: File): Either[String, Seq[String]] = {
    if (file.getPath.contains("scala"))
      Left(errorMessage)
    else
      Right(Source.fromFile(file).getLines().toSeq)
  }

  // add the text expected from the tests to each of the projections
  // Hint: either.fold
  def formatResponse(response: Either[String, Seq[String]]): String = {
    response.fold("Error:\n" + _, "Response:\n" + _.mkString("\n"))
  }

  // Syntax for ignoring case in regex is "(?i)expr"
  def censorLine(line: String): String = line.replaceAll("(?i)scala", "*** CENSORED ***")

  // reuse where practical. remember the collection functions from earlier.
  def fetchCensoredContent(file: File): Either[String, Seq[String]] = fetchUncensoredContent(file).right.map(_.map(censorLine))
}
