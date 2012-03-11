# Clojure/West Cascalog Class Setup

This is a barebones Cascalog project, designed to test your Leiningen setup before we get started on Tuesday.

## Usage

This project contains a Cascalog implementation of wordcount (in `src/cascalog_class/core.clj`) and a test of the wordcount query (in `test/cascalog_class/core_test.clj`). Before Tuesday's class, I'd like to make sure that everyone can successfully set up this Leiningen project and get the tests passing. 

To download the project's dependencies, run the following:


```bash
lein deps
```

The wordcount test is written using the excellent [Midje](https://github.com/marick/Midje) testing library for Clojure, with a little help from my [midje-cascalog](https://github.com/sritchie/midje-cascalog) library. This project includes Midje's Leiningen plugin as a dev dependency, allowing us to run the tests from the shell with a single command:

```bash
lein midje
```

Go ahead and type that in. You should see the following output:

```bash
All claimed facts (1) have been confirmed. 
```

That's it! Please let me know if you have any issues. I'll being sending you all a project full of example code and problems around Monday. In the meantime, if you're hungry to start learning more, I recommend taking a look at the [Cascalog Wiki](https://github.com/nathanmarz/cascalog/wiki).
