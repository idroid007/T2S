package Text2Speech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Sample {
	private String path = "C:\\T2S\\mbrola";
	 public void speak1(){
		 System.setProperty("mbrola.base", path);
		 System.out.println("Speaking......");
		 Voice voice;
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice("mbrola_us1");
		  voice.allocate();
		  voice.speak("Hello I am Female Voice U.S .");
		  System.out.println("");
	 }
	 public void speak2(){
		 System.setProperty("mbrola.base", path);
		 System.out.println("Speaking.....");
		 Voice voice;
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice("mbrola_us2");
		  voice.allocate();
		  voice.speak("Hello I am MAle Voice U.S .");
		  System.out.println("");
	 }
	 public void speak3(){
		 System.setProperty("mbrola.base", path);
		 System.out.println("Speaking.......");
		 Voice voice;
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice("mbrola_us3");
		  voice.allocate();
		  voice.speak("Hello I am Male Voice U.S 2.");
		  System.out.println("");
	 }
}
