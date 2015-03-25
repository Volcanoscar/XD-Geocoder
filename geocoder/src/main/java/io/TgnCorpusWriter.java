package io;

import java.io.PrintWriter;
import java.util.List;

import core.Tweet;

public class TgnCorpusWriter {	
	
	List<Tweet> tweets;
	PrintWriter writer;
	
	public TgnCorpusWriter(PrintWriter writer, List<Tweet> tweets) {
		this.writer = writer;
		this.tweets = tweets;
	}
	
	public void writeFile() {
		for(Tweet t : tweets) {
			writer.println(t.getTgnMessage());
		}
		writer.close();
	}
	
	

}
