package net.ittimeline.java.core.api.lang;

/**
 * Runtime exec()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 10:45
 * @since Java21
 */
public class RuntimeExecTest {

    /**
     * @see Runtime#exec(String) 在单独的进程中执行指定的字符串命令
     * @param args
     */
    public static void main(String[] args) {
        // 执行notepad命令
        try {
            // Windows系统：执行notepad命令，打开记事本程序
            Process process = Runtime.getRuntime().exec("notepad.exe");
            //Linux系统：执行gedit命令，打开文本编辑器
            //Process process = Runtime.getRuntime().exec("gedit");
            // 等待进程结束
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
