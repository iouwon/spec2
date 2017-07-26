import org.specs2.mutable.Specification
import org.specs2.mock.Mockito

abstract class Mockable {
  def methodToMock(arg: List[String]): String
}

class Specs2MockitoIncompatSpec extends Specification with Mockito {
  val theMock = mock[Mockable]
  theMock.methodToMock(===(List[String]())).returns("Hello")
  theMock.methodToMock(===(List(""))).returns("World!")

  "The mock will throw an NPE matching a list when setting the second set of expectations in a mock" >> {
    "using a specs2 EqualityMatcher and SeqLinesDiffable implicit" >> {
      "assertion to make the test work" === "assertion to make the test work"
    }
  }
}
