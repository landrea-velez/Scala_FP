package co.com.scalatraining.scalatest.specs

import org.scalatest._
import org.scalatest.prop._

import scala.collection.immutable._

class SetPropSpec extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val examples: TableFor1[Set[Int] with Serializable] =
    Table(
      "set",
      BitSet.empty,
      HashSet.empty[Int],
      TreeSet.empty[Int]
    )

  property("an empty Set should have size 0") {
    forAll(examples) { set =>
      set.size should be (0)
    }
  }

  property("invoking head on an empty set should produce NoSuchElementException") {
    forAll(examples) { set =>
      a [NoSuchElementException] should be thrownBy { set.head }
    }
  }
}