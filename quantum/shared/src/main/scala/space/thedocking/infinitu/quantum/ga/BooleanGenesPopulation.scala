package space.thedocking.infinitu.quantum.ga

import space.thedocking.infinitu.integer.Integer1DObjectAddress
import space.thedocking.infinitu.universe.Universe
import space.thedocking.infinitu.dimension.DiscreteDimensionValue
import space.thedocking.infinitu.integer.IntegerValue

case class BooleanGenesPopulation(
  override val individuals: Universe[Integer1DObjectAddress, BooleanGenesChromosome],
  val fitnessValues: Map[Integer1DObjectAddress, IntegerValue])
    extends Population[Integer1DObjectAddress, BooleanGenesChromosome, IntegerValue] {

  override def fitnessValue(individualAddress: Integer1DObjectAddress): IntegerValue = fitnessValues(individualAddress)

}
