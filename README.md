# Testing Compile Times
I struggle with long compile times. 

This project should help optimizing it and ask questions to specialists;).

At the moment I think the problem is the Type derivation for JSON marshalling.

## Usage 

### Cleanup

Just delete the `generated` package in `src/main/scala/scala3/compile/tests`.

### Generate Test Classes

I added 2 Source Generators:

- _CiceGenerator_
- _JsoniterGenerator_

You can edit `numberOfTestFiles`, default is 50.

```bash
> sbt run
Multiple main classes detected. Select one to run:
 [1] scala3.compile.tests.generated.main
 [2] scala3.compile.tests.mainCirce (-> CiceGenerator)
 [3] scala3.compile.tests.mainJsoniter (-> JsoniterGenerator)
 ```

### Test Compile Times
I added `scalacOptions ++= Seq("-Vprofile",)` to get more information.

Just `sbt compile`


