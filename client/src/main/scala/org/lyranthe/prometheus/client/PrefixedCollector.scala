package org.lyranthe.prometheus.client

import org.lyranthe.prometheus.client.internal.Collector

trait PrefixedCollector extends Collector {
  def name: MetricName

  final def underlyingName: Option[MetricName] = Some(name)
}
