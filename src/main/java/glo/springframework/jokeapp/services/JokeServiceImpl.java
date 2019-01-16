package glo.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
	private static ChuckNorrisQuotes chuckNorrisQuotes;

	private JokeServiceImpl()
	{
	}

	public static ChuckNorrisQuotes getChuckNorrisQuotes()
	{
		if(chuckNorrisQuotes == null)
		{
			chuckNorrisQuotes = new ChuckNorrisQuotes();
		}

		return chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return getChuckNorrisQuotes().getRandomQuote();
	}
}
