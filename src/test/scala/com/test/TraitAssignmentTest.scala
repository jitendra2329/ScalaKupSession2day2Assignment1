package com.test
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.{Boat, Car,Aeroplane,FlyingCar,Hovercraft}

class TraitAssignmentTest extends  AnyFlatSpec {

  "Car" should  "be driven" in {
        val car = new Car
        assert(car.move == ("Car can be driven."))
  }

  "Boat" should "be sailed" in {
        val boat = new Boat
        assert(boat.move == ("Boat can be sailed."))
  }

  "Aeroplane" should "be flown" in {
        val aeroplane = new Aeroplane
        assert(aeroplane.move == ("Aeroplane can be flown."))
  }

  "Flying car" should "be driven and flown" in {
        val  flyingCar = new FlyingCar
        assert(flyingCar.move == ("Flying cars: can be driven and flown."))
  }

  "Hovercraft" should "be sailed and flown" in {
        val hovercraft = new Hovercraft
        
        assert(hovercraft.move == ("Hovercraft: can be sailed and flown."))
  }
}
