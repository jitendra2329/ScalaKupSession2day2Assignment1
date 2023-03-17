package com.knoldus

trait Vehicle {
  def move : String
}

trait Driveable extends Vehicle {
  val drivingCapability: String = "driven"

}

trait Sailable extends Vehicle {
  val saileCapability: String = "sailed"
}

trait Flyable extends Vehicle {
  val flyingCapability: String = "flown"
}


//class Car extending the trait Driveable
class Car extends Driveable {

  override def move: String = s"Car can be ${drivingCapability}."
}

//class Boat extending the trait Sailable
class Boat extends Sailable {

  override def move: String = s"Boat can be ${saileCapability}."
}

//class Aeroplane extending the trait Flyable
class Aeroplane extends Flyable {

  override def move: String = s"Aeroplane can be ${flyingCapability}."
}

//class FlyingCar extending the  trait Flyable with Driveable (Having the capabilities of flying and driving)
class FlyingCar extends Flyable with Driveable {

  override def move: String = s"Flying cars: can be ${drivingCapability} and ${flyingCapability}."
}

///class Hovercraft extending the  trait Flyable with Sailable (Having the capabilities of flying and sailing)
class Hovercraft extends Sailable with Flyable {

  override  def move: String = s"Hovercraft: can be ${saileCapability} and ${flyingCapability}."
}
