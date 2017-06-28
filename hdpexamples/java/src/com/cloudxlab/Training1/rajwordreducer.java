package com.cloudxlab.Training1;
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class rajwordreducer extends Reducer<Text, LongWritable, Text, LongWritable>
throws IOException, InterruptedException
{
public void reduce(Text key, Iterable <LongWritable> values, Context context)
{
Long sum = 0;
for(LongWritable iw:values)
{
 sum = sum + iw.get();
}

context.write(key, new LongWritable(sum));

}


}
