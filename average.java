public Double average(List<Integer> list) {
 return list
 .stream()
 .mapToDouble(i -> (double)i)
 .average()
 .getAsDouble();
}