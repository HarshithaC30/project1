var currentTime = new Date();
var hours = currentTime.getHours();
var minutes = currentTime.getMinutes();

var suffix = "AM";

if (hours >= 12) {
    suffix = "PM";
    hours = hours - 12;
}

if (hours == 0) {
    hours = 12;
}

if (minutes < 10) {
    minutes = "0" + minutes;
}

console.log("Local hour: " + hours + ":" + minutes + " " + suffix);