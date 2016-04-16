package Text2Speech;
import javax.sound.sampled.AudioFileFormat.Type;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
public class T2S {
	private static float  pitch ;
	private static float  srate;
	private String VoiceName;
	private String path = "C:\\T2S\\mbrola";
	 private String text;
	 public T2S(String text,String VoiceName){
		 this.text=text;
		 this.VoiceName=VoiceName;
	 }
	 
	
	 public static float getPitch() {
		return pitch;
	}


	public static void setPitch(float pitch) {
		T2S.pitch = pitch;
	}


	public static float getSrate() {
		return srate;
	}


	public static void setSrate(float srate) {
		T2S.srate = srate;
	}


	public void speak(){
		System.out.println(srate);
		 System.setProperty("mbrola.base", path);
		 Voice voice;
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice(VoiceName);
		  if(srate!=0.0){
			  voice.setRate(srate);
		  }
		  if(pitch!=0.0){
			  voice.setPitch(pitch);
		  }
		  voice.allocate();
		  voice.speak(text);
		  
	 }
	 public void save(String loc){
		 String name="c:\\T2S\\"+loc;
		 System.setProperty("mbrola.base", path);
		 Voice voice;
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice(VoiceName);
		  if(srate!=0.0){
			  voice.setRate(srate);
		  }
		  if(pitch!=0.0){
			  voice.setPitch(pitch);
		  }
		  voice.allocate();
		  
		  AudioPlayer audioPlayer = null;
			 audioPlayer = new SingleFileAudioPlayer(name,Type.WAVE);
			 voice.setAudioPlayer(audioPlayer);
			 voice.speak(text);
			 voice.deallocate();
			 audioPlayer.close();
	 }
}
