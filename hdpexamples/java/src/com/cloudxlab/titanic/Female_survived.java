public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
 
Configuration conf=new Configuration();
 
Job job=new Job();
 
job.setJarByClass(Female_survived.class);
 
job.setMapperClass(Map.class);
 
job.setReducerClass(Reduce.class);
 
job.setOutputKeyClass(Key_value.class);
 
job.setMapOutputKeyClass(Key_value.class);
 
job.setMapOutputValueClass(IntWritable.class);
 
job.setOutputValueClass(IntWritable.class);
 
job.setInputFormatClass(Titanic_input.class);
 
job.setOutputFormatClass(TextOutputFormat.class);
 
Path out=new Path(args[1]);
 
out.getFileSystem(conf).delete(out);
 
FileInputFormat.addInputPath(job,new Path( args[0]));
 
FileOutputFormat.setOutputPath(job, new Path(args[1]));
 
job.waitForCompletion(true);
 
}
