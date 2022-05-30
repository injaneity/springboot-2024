# JAVA MAVEN DEPENDENCY INJECTION

## Installation Instructions

This project uses Maven wrapper, which will automatically download maven into this project.

## MacOS/Linux
Run the following command
```bash
./mvnw clean install
```
## Windows
```bash
mvnw.cmd clean install
```

## Troubleshooting
If you see the following error, it means you do not have JAVA installed.

```text
Error: JAVA_HOME not found in your environment.
Please set the JAVA_HOME variable in your environment to match the 
location of your Java installation.
```
Please install JDK for your operating system. \
Ensure JAVA_HOME is set and java/javac is available on the system path. \
You install JDK from here: https://adoptium.net/

## SCENARIO - It's SHOWTIME!

Implement a Showtime clock that does 2 things when the whatTimeIsIt method is called:

- Prints the string "The time now is HH:mm:ss", where HH:mm:ss is the format of the current system time.
- Every time the number of seconds is a multiple of 7 or has the number 7, it will print an extra string "It's Showtime!!"

## Sample:
time / output \
11:00:00 / The time now is 11:00:00 \
11:00:01 / The time now is 11:00:01 \
11:00:02 / The time now is 11:00:02 \
11:00:03 / The time now is 11:00:03 \
11:00:04 / The time now is 11:00:04 \
11:00:05 / The time now is 11:00:05 \
11:00:06 / The time now is 11:00:06 \
11:00:07 / The time now is 11:00:07 It's Showtime!! \
... \
11:00:15 / The time now is 11:00:14 It's Showtime!! \
11:00:15 / The time now is 11:00:15 \
11:00:16 / The time now is 11:00:16 \
11:00:17 / The time now is 11:00:17 It's Showtime!!

## Limitations
For the illustration purpose, try to make use of Clock to derive the time.

## Helpful Tips
See ShowTimeClockTest.tipsAndTricks() for hints
