var Car = /** @class */ (function () {
    function Car(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }
    Car.prototype.accelerate = function () {
        this.speed += 10;
        console.log("Accelerating to ".concat(this.speed, " mph"));
    };
    Car.prototype.decelerate = function () {
        if (this.speed > 0) {
            this.speed -= 10;
            console.log("Decelerating to ".concat(this.speed, " mph"));
        }
        else {
            console.log('Car is already stopped');
        }
    };
    Car.prototype.stop = function () {
        this.speed = 0;
        console.log('Car has stopped');
    };
    Car.prototype.getMake = function () {
        return this.make;
    };
    Car.prototype.getModel = function () {
        return this.model;
    };
    Car.prototype.getYear = function () {
        return this.year;
    };
    Car.prototype.getSpeed = function () {
        return this.speed;
    };
    return Car;
}());
function main() {
    var car = new Car('Toyota', 'Camry', 2022);
    console.log("A new ".concat(car.getMake(), " ").concat(car.getModel(), " was created"));
    while (true) {
        var input = prompt('Enter a command (a=accelerate, d=decelerate, s=stop):');
        if (input === 'a') {
            car.accelerate();
        }
        else if (input === 'd') {
            car.decelerate();
        }
        else if (input === 's') {
            car.stop();
            break;
        }
        else {
            console.log('Invalid command');
        }
    }
}
main();
