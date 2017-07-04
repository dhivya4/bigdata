public static class Map extends Mapper<Key_value, Text, Key_value, IntWritable> {
 
private final static IntWritable one = new IntWritable(1);
 
public void map(Key_value key, IntWritable value, Context context ) throws IOException, InterruptedException {
 
context.write(key1, one);
 
}
 
}
