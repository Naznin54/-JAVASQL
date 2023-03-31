class Animal {
    name: string;
    age: number;
    sound: string;
  
    constructor(name: string, age: number, sound: string) {
      this.name = name;
      this.age = age;
      this.sound = sound;
    }
  
    makeSound(): void {
      console.log(`${this.name} makes the sound ${this.sound}.`);
    }
  }
  
  class Mammal extends Animal {
    furColor: string;
  
    constructor(name: string, age: number, sound: string, furColor: string) {
      super(name, age, sound);
      this.furColor = furColor;
    }
  
    giveBirth(): void {
      console.log(`${this.name} gives birth to live young.`);
    }
  }
  
  class Bird extends Animal {
    wingSpan: number;
  
    constructor(name: string, age: number, sound: string, wingSpan: number) {
      super(name, age, sound);
      this.wingSpan = wingSpan;
    }
  
    fly(): void {
      console.log(`${this.name} flies with a wingspan of ${this.wingSpan} meters.`);
    }
  }
  
  class Fish extends Animal {
    waterType: string;
  
    constructor(name: string, age: number, sound: string, waterType: string) {
      super(name, age, sound);
      this.waterType = waterType;
    }
  
    swim(): void {
      console.log(`${this.name} swims in ${this.waterType} water.`);
    }
  }
  
  
  const elephant = new Mammal('Ellie', 10, 'trumpet', 'gray');
  elephant.makeSound(); 
  elephant.giveBirth(); 
  
  const baldEagle = new Bird('Baldy', 5, 'screech', 2);
  baldEagle.makeSound(); 
  baldEagle.fly(); 
  const salmon = new Fish('Sam', 2, 'splash', 'fresh');
  salmon.makeSound(); 
  salmon.swim(); 
  