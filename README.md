# Prometheus client for Scala

[![Join the chat at https://gitter.im/prometheus_client_scala/Lobby](https://badges.gitter.im/prometheus_client_scala/Lobby.svg)](https://gitter.im/prometheus_client_scala/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This Prometheus client offers an idiomatic API for instrumenting applications written in Scala. It tries to provide an API which is efficient, easy to use. Also, as far as possible, it tries to report API usage errors at compile time instead of runtime.

Helper modules support Play controller timing, along with helper syntax for the `cats.effect.Sync` typeclass, `fs2.Task`, `scalaz.concurrent.Task` and `monix.eval.Task`.

In addition, it offers some extra insight into your program by exposing some useful VM statistics.

## Adding the library to your build

```scala
libraryDependencies += "org.lyranthe.prometheus" %% "client" % "0.9.0-M1"
```

## Documentation

 - [Guide](https://www.lyranthe.org/prometheus_client_scala/guide/)
 - [API](https://www.lyranthe.org/prometheus_client_scala/latest/api/#org.lyranthe.prometheus.client.package)
