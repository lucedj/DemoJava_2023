package rs.ac.ni.pmf.oop2;

public class TextParser
{
	Encoder _encoder;

	public void setEncoder(Encoder encoder)
	{
		_encoder = encoder;
	}

	public String parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		store(encoded);
		return encoded;
	}

	private void store(final String encoded)
	{
		System.out.println("Storing the value " + encoded);
	}
}
