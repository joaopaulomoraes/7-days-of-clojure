# Day 7 – Create and run your first project

These days, most Clojurists use Leiningen to build and manage their projects.

## Instalation

Leiningen is the easiest way to use Clojure with a focus on project automation and declarative configuration.
To see how to [install](https://leiningen.org/) and configure Leiningen, go to the official documentation and follow the necessary steps.

## Creating a new project

After the installation finishes, run to the terminal and create your first project with the command:

```bash
lein new app my-first-clojure-app
```

Access the directory.

```bash
cd my-first-clojure-app
```

When listing directory files, you should have output similar to this.

```bash
.
├── CHANGELOG.md
├── LICENSE
├── README.md
├── doc
│   └── intro.md
├── project.clj
├── resources
├── src
│   └── my_first_clojure_app
│       └── core.clj
└── test
    └── my_first_clojure_app
        └── core_test.clj

6 directories, 7 files
```

The `project.clj` file is the file that holds the project settings and specifies the dependencies for the project.

```clojure
(defproject my-first-clojure-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot my-first-clojure-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

```

In `src/my_first_clojure_app/core.clj` is where you will write your Clojure code for a while or until you need to separate the application into other namespaces.

As the name suggests, `tests` is where you will store all test files for their respective resources.

And finally, `resources` store's assets as images, etc.

## Run the project

Before running the project, open the file `src/my_first_clojure_app/core.clj` and change the entry point of your program.

```clojure
(ns my-first-clojure-app.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "This is the first app in Clojure!"))
```

Then run the project with the command:

```bash
lein run
```

This should be the output: `This is the first app in Clojure!`

Using `lein run` to test your development code is great and helps you save a lot of time without compiling a file.

But there are cases where you will need to compile your program to run on other platforms that do not have Leiningen or some production code. To complicate the project, you can simply use the following command:

```bash
lein uberjar
```

When you run the command, you will be presented with your Clojure program that can be run on any platform.

If all went well, you should have the following console output.

```bash
Created .../my-first-clojure-app/target/uberjar my-first-clojure-app-0.1.0-SNAPSHOT.jar
```

Voce pode executar o programa gerado como faria com qualquer programa em Java.

```bash
java -jar target/uberjar/my-first-clojure-app-0.1.0-SNAPSHOT.jar
```

Wow, congratulations! You now have all the basic details you need to build, run, and distribute (very) basic Clojure programs.

## Tests

Leiningen provides a more automated and simple way to run the tests in your application.

```bash
lein test
```

That will generate the following output.

```bash
lein test my-first-clojure-app.core-test

lein test :only my-first-clojure-app.core-test/a-test

FAIL in (a-test) (core_test.clj:7)
FIXME, I fail.
expected: (= 0 1)
  actual: (not (= 0 1))

Ran 1 tests containing 1 assertions.
1 failures, 0 errors.
Tests failed.
```

Go to the `test/my_first_clojure_app/core_test.clj` file and change the test.

```clojure
(deftest a-test
  (testing "Fixed! It works now."
    (is (= 1 1))))
```

Now, running again for `lein test` will get the following output.

```bash
lein test my-first-clojure-app.core-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

## Test your knowledge

- Create a new app using `lein`.
- Use o conhecimento que voce adquiriu nos dias anteriores para criar novas funcionalidades ao seu programa.
- Compile your program with `lein uberjar` and send it to a friend to execute.
- Build your imagination and keep on studying.

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
