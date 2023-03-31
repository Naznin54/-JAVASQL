class Car {
    private make: string;
    private model: string;
    private year: number;
    private speed: number;
  
    constructor(make: string, model: string, year: number) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.speed = 0;
    }
  
    public accelerate(): void {
      this.speed += 10;
      console.log(`Accelerating to ${this.speed} mph`);
    }
  
    public decelerate(): void {
      if (this.speed > 0) {
        this.speed -= 10;
        console.log(`Decelerating to ${this.speed} mph`);
      } else {
        console.log('Car is already stopped');
      }
    }
  
    public stop(): void {
      this.speed = 0;
      console.log('Car has stopped');
    }
  
    public getMake(): string {
      return this.make;
    }
  
    public getModel(): string {
      return this.model;
    }
  
    public getYear(): number {
      return this.year;
    }
  
    public getSpeed(): number {
      return this.speed;
    }
  }
  
   function main(): void {
  const car = new Car('Toyota', 'Camry', 2022);
  console.log(`A new ${car.getMake()} ${car.getModel()} was created`);
  
  while (true) {
    const input = prompt('Enter a command (a=accelerate, d=decelerate, s=stop):');
    if (input === 'a') {
      car.accelerate();
    } else if (input === 'd') {
      car.decelerate();
    } else if (input === 's') {
      car.stop();
      break;
    } else {
      console.log('Invalid command');
    }
  }
   }
   main();
  