package leet;

import com.sun.deploy.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/29/17.
 */
public class GroupAnagramsTest {
    @Test
    public void groupAnagrams() throws Exception {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        Assert.assertTrue(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size() == 3);
    }

}