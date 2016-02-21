package dojo;


public class LineCounter {
	
	private String text = null;
	
	public int count() {
		removerComentarioMultiplasLinhas();
		removerComentarioUmaLinha();
		removerEspacoEmBranco();
		
		if(text.isEmpty()){
			return 0;
		}
		
		return text.split("\n").length;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	private void removerComentarioUmaLinha(){
		text = text.replaceAll("(\\/\\/.*)", "");
	}
	
	private void removerComentarioMultiplasLinhas(){
		text = text.replaceAll("\\/\\*[\\s\\S]*?\\*\\/", "");
	}
	
	private void removerEspacoEmBranco(){
		text = text.replaceAll("(?m)^\\s*", "").trim();
	}
}
