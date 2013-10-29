package scalakurs.collections

object MapOppgaver {
  def nyttMap[K, V](key: K, value: V): Map[K, V] = Map(key, value)

  def leggTilAssosiasjon[K, V](map: Map[K, V], key: K, value: V): Map[K, V] = map + (key, value)

  // ta bort assosiasjon med gitt key
  def taBortAssosiasjon[K, V](map: Map[K, V], key: K): Map[K, V] = map - key

  // ta bort assosiasjon som tilfredstiller predikatet
  def taBortAssosiasjon[K, V](map: Map[K,V], predicate: ((K,V)) => Boolean): Map[K, V] = map.filterNot(predicate)

  def brukFunksjonPåAlleVerdier[K, V, VV](map: Map[K, V], f: V => VV): Map[K,VV] = map.mapValues(f)

  // hint: withDefaultValue
  def mapMedDefault[K, V](l: List[(K, V)], default: V): Map[K, V] = l.toMap.withDefaultValue(default)

  // hint: orElse
  def hentMedFallbackMap[K, V](key: K, mapA: Map[K, V], fallbackMap: Map[K, V]): V = mapA.orElse(fallbackMap)(key)
}


