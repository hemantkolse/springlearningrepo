/*package com.journaldev.asynchexample;

import java.io.File;

import org.springframework.scheduling.annotation.Async;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaViewer;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncoderException;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.InputFormatException;
import ws.schild.jave.MultimediaObject;
import ws.schild.jave.VideoAttributes;
import ws.schild.jave.VideoSize;


public class XuggleApiTest {

     private static final String inputFilename = "C:\\Users\\10900\\Pictures\\sam.flv";
        private static final String outputFilename = "C:\\Users\\10900\\Pictures\\filename.mp4";
        public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
            IMediaReader mediaReader = 
                   ToolFactory.makeReader(inputFilename);
            IMediaWriter mediaWriter = 
                   ToolFactory.makeWriter(outputFilename, mediaReader);
            mediaReader.addListener(mediaWriter);
            IMediaViewer mediaViewer = ToolFactory.makeViewer(true);
             mediaReader.addListener(mediaViewer);
            while (mediaReader.readPacket() == null) ;

            
            
    
            
            File source = new File("C:\\Users\\10900\\Pictures\\sam.flv");
            MultimediaObject mul = new MultimediaObject(source);
            File target = new File("C:\\Users\\10900\\Pictures\\filename.mp4");
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(new Integer(64000));
            audio.setChannels(new Integer(1));
            audio.setSamplingRate(new Integer(22050));
            VideoAttributes video = new VideoAttributes();
            video.setCodec("flv");
            video.setBitRate(new Integer(160000));
            video.setFrameRate(new Integer(15));
            video.setSize(new VideoSize(400, 300));
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("flv");
            attrs.setAudioAttributes(audio);
            attrs.setVideoAttributes(video);
            Encoder encoder = new Encoder();
            encoder.encode(mul, target, attrs);
        }
        
        
        
        @Async("specificTaskExecutor")
  	    public void runFromAnotherThreadPool() {
  	      System.out.println("You function code here       "+System.currentTimeMillis());
  	  }
        
        
        
        
}*/