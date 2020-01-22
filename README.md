# sample-jakartaee-gradle-cargo

Multi-module gradle project relying on cargo to run on development mode.

## First steps

Must download and setup 
[payara server full](https://www.payara.fish/software/downloads/all-downloads/)
before run this project. 

This project expects the `payara5` folder at your `$HOME` (see
module-web/build.gradle for details)

Run at least once:

```bash
gradle cargoConfigureLocal
```

Aftter that, run:

```bash
gradle cargoRunLocal
```

And finally, in order to get things updating, open a second console and:

```bash
gradle -t cargoRedeployLocal
```

## Why [Payara](https://www.payara.fish/)

It's JEE8-compliant and might be on time when jakarta-ee finally arrives,
breaking things with tears of joy.

## Why cargo

Because no unsung here did a decent infrastructure for java app containers on 
visual studio code, therefore the build systems must cover the gap.

Also ii want to believe that _springboot_ isn't the only way. I like my 
kbyte-scale war file.
