package yandexcontest

import kotlin.math.abs

typealias Coords = Pair<Int, Int>
typealias Index = Int
typealias Road = List<Index>

fun main() {
    val numberOfCities = readLine()!!.toInt()
    val cities = mutableListOf<Coords>()
    for(c in 0 until numberOfCities) {
        val coordsLine = readLine()!!
        val coords = coordsLine.split(" ")
        cities += coords.first().toInt() to coords[1].toInt()
    }
    val limit = readLine()!!.toInt()
    val roadLine = readLine()!!.split(" ")
    val fromIndex: Index = roadLine.first().toInt() - 1
    val destinationIndex: Index = roadLine[1].toInt() - 1

    val road = findRoads(fromIndex, destinationIndex, cities, limit).minBy { it.size }
    if (road == null)
        println("-1")
    else
        println(road.size - 1) // number of roads
}

fun findRoads(from: Index, destination: Index, cities: List<Coords>, limit: Int): List<Road> {
    val roads = mutableListOf<Road>()
    if (len(cities[from], cities[destination]) <= limit)
        roads += listOf(from, from)

    for (r in cities.indices) {
        val road = mutableListOf<Index>()
        road += from
        for (c in cities.indices) {
            if (!road.contains(c))
                if (len(cities[road.last()], cities[c]) <= limit) {
                    road += c
                    if (c == destination)
                        break
                }
        }

        if (road.contains(destination))
            roads += road
    }

    return roads
}

fun len(first: Coords, second: Coords) : Int {
    return abs(second.first - first.first) + abs(second.second - first.second)
}