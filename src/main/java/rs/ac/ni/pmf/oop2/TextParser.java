package rs.ac.ni.pmf.oop2;

import rs.ac.ni.pmf.oop2.storage.WritableStorage;

public class TextParser
{
	Encoder _encoder;
	WritableStorage _storage;

	public void setEncoder(Encoder encoder) {
		_encoder = encoder;
	}

	public void setStorage(WritableStorage storage) {
		_storage = storage;
	}

	public String parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		if (_storage != null)
			_storage.store(encoded);
		return encoded;
	}
}
